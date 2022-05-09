package co.edu.cue.ed.collections.list.linkedList;


public class ListaGenerica {

    class Nodo {
        int info;
        Nodo ant,sig;
    }

    private Nodo raiz;

    public ListaGenerica () {
        raiz=null;
    }

    void insertar (int pos, int x)
    {
        if (pos <= cantidad () + 1)    {
            Nodo nuevo = new Nodo ();
            nuevo.info = x;
            if (pos == 1){
                nuevo.sig = raiz;
                if (raiz!=null)
                    raiz.ant=nuevo;
                raiz = nuevo;
            } else
            if (pos == cantidad () + 1)    {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                reco.sig = nuevo;
                nuevo.ant=reco;
                nuevo.sig = null;
            } else {
                Nodo reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo siguiente = reco.sig;
                reco.sig = nuevo;
                nuevo.ant=reco;
                nuevo.sig = siguiente;
                siguiente.ant=nuevo;
            }
        }
    }

    public int extraer (int pos) {
        if (pos <= cantidad ())    {
            int informacion;
            if (pos == 1) {
                informacion = raiz.info;
                raiz = raiz.sig;
                if (raiz!=null)
                    raiz.ant=null;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                Nodo siguiente=prox.sig;
                if (siguiente!=null)
                    siguiente.ant=reco;
                informacion = prox.info;
            }
            return informacion;
        }
        else
            return Integer.MAX_VALUE;
    }

    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                raiz = raiz.sig;
                if (raiz!=null)
                    raiz.ant=null;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                prox=prox.sig;
                reco.sig = prox;
                if (prox!=null)
                    prox.ant=reco;
            }
        }
    }

    public void intercambiar (int pos1, int pos2) {
        if (pos1 <= cantidad () && pos2 <= cantidad ())    {
            Nodo reco1 = raiz;
            for (int f = 1 ; f < pos1 ; f++)
                reco1 = reco1.sig;
            Nodo reco2 = raiz;
            for (int f = 1 ; f < pos2 ; f++)
                reco2 = reco2.sig;
            int aux = reco1.info;
            reco1.info = reco2.info;
            reco2.info = aux;
        }
    }

    public int mayor () {
        if (!vacia ()) {
            int may = raiz.info;
            Nodo reco = raiz.sig;
            while (reco != null) {
                if (reco.info > may)
                    may = reco.info;
                reco = reco.sig;
            }
            return may;
        }
        else
            return Integer.MAX_VALUE;
    }

    public int posMayor() {
        if (!vacia ())    {
            int may = raiz.info;
            int x=1;
            int pos=x;
            Nodo reco = raiz.sig;
            while (reco != null){
                if (reco.info > may) {
                    may = reco.info;
                    pos=x;
                }
                reco = reco.sig;
                x++;
            }
            return pos;
        }
        else
            return Integer.MAX_VALUE;
    }

    public int cantidad ()
    {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }

    public boolean ordenada() {
        if (cantidad()>1) {
            Nodo reco1=raiz;
            Nodo reco2=raiz.sig;
            while (reco2!=null) {
                if (reco2.info<reco1.info) {
                    return false;
                }
                reco2=reco2.sig;
                reco1=reco1.sig;
            }
        }
        return true;
    }

    public boolean existe(int x) {
        Nodo reco=raiz;
        while (reco!=null) {
            if (reco.info==x)
                return true;
            reco=reco.sig;
        }
        return false;
    }

    public boolean vacia ()
    {
        if (raiz == null)
            return true;
        else
            return false;
    }

    public void imprimir ()
    {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public static void main(String[] ar) {
        ListaGenerica lg=new ListaGenerica();
        lg.insertar (1, 10);
        lg.insertar (2, 20);
        lg.insertar (3, 30);
        lg.insertar (2, 15);
        lg.insertar (1, 115);
        lg.imprimir ();
        System.out.println ("Luego de Borrar el primero");
        lg.borrar (1);
        lg.imprimir ();
        System.out.println ("Luego de Extraer el segundo");
        lg.extraer (2);
        lg.imprimir ();
        System.out.println ("Luego de Intercambiar el primero con el tercero");
        lg.intercambiar (1, 3);
        lg.imprimir ();
        if (lg.existe(10))
            System.out.println("Se encuentra el 20 en la lista");
        else
            System.out.println("No se encuentra el 20 en la lista");
        System.out.println("La posición del mayor es:"+lg.posMayor());
        if (lg.ordenada())
            System.out.println("La lista está ordenada de menor a mayor");
        else
            System.out.println("La lista no está ordenada de menor a mayor");
    }
}

