import javax.swing.*;

public class Biblioteca 
{
    
 Nodolibro []datosL;
 final int L=5;
 int Pos;
 Nodolibro Aux;
 
 
public Biblioteca()
{
    int I; Pos=0;
    datosL=new Nodolibro[L];
    for (I=0;I<L;I++) {
        datosL[I]=null;
    }
}
void Almacenarlibro()
{
    int Cgo; 
    String Tit, Aut, Gen;
    int Edic;
    if (Pos<L)
    {
        Aux=new Nodolibro();
        Cgo= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Codigo Del Libro"));
        Tit=JOptionPane.showInputDialog(null, "Digite Titulo");
        Aut=JOptionPane.showInputDialog(null, "Digite Autor");
        Gen=JOptionPane.showInputDialog(null, "Digite Genero");
        Edic=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Edicion"));
        Aux.Registrar(Cgo,Tit,Aut,Gen,Edic);
        datosL[Pos]=Aux;
        Pos=Pos+1;
    }
    else {
        JOptionPane.showMessageDialog(null,"Vector Lleno");
    }
}

void Buscar(int Cod)
{
    int I; int ban=0;
    if(datosL[0]!=null)
    {
        for(I=0;I<Pos;I++)
        {
            if (Cod==datosL[I].getCodigo())
            {
                datosL[I].Mostrar();
                ban=1;
            }
        
        if (ban==1) {
                break;
            }
        
    }
    }
    else {
        JOptionPane.showMessageDialog(null,"Vector Vacio");
    } 
    if (ban==0) {
        JOptionPane.showMessageDialog(null,"No Encontrado");
    }
}

void Mostrartodo()
{
    int I;
    if (datosL[0]!=null)
    {   
        for (I=0;I<Pos;I++) {
            datosL[I].Mostrar();
        }
    }
 else {
        JOptionPane.showMessageDialog(null,"Vector Vacio");
    } 
       
}
void Eliminar(int Cod){
    int I; int ban=0;
    if(datosL[0]!=null)
        
    {
        for(I=0;I<Pos;I++)
        {
            if (Cod==datosL[I].getCodigo())
            {
                datosL[I]=null;
                
                ban=1;
            }
        
        if (ban==1) {
                break;
            }
        
    }
    }
    else {
        JOptionPane.showMessageDialog(null,"Vector Vacio");
    } 
    if (ban==0) {
        JOptionPane.showMessageDialog(null,"No Encontrado");
    }
}
public static void main(String []Q)
{
  Biblioteca Obteca=new Biblioteca();
  int op;
  op=Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Registra\n 2 - Muestra\n 3 - Buscar\n 4 - Eliminar\n 5 - salir"));
   do
   {
       if(op==1) {
           Obteca.Almacenarlibro();
       }
       else
       if(op==2) {
           Obteca.Mostrartodo();
       }
       else
       if(op==3) {
           int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato"));
           Obteca.Buscar(c);
       }
       else
           if(op==4) {
           int e=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato"));
               Obteca.Eliminar(e);
       }
         op=Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Registra\n 2 - Muestra\n 3 - Buscar\n 4 - Eliminar\n 5 - salir"));
   }while((op>=1)&&(op<=4));

}

}

