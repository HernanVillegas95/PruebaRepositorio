import javax.swing.*;
public class Nodolibro {
    
  int Codigo;
  String Titulo;
  String Autor;
  String Genero;
  int  Edicion;
  
  public Nodolibro()
  {
      
      Codigo=0;
      Titulo="";
      Autor="";
      Genero="";
      Edicion=0;
      
  }
  
  void setCodigo(int C)
  {
      Codigo=C;
  }
    
  void setTitulo(String T)
  {
      Titulo=T;
  }
  void setAutor(String A)
  {
      Autor=A;
  }
  void setGenero(String G)
  {
      Genero=G;
  }
    void setEdicion(int E)
  {
      Edicion=E;
  }
    
    int getCodigo()
    {
        return (Codigo);
    }
    String getTitulo()
    {
        return (Titulo);
    }
    String getAutor()
    {
        return (Autor);
    }
    String getGenero()
    {
        return (Genero);
    }
    int getEdicion()
    {
        return (Edicion);
    }
    
    void Registrar(int Cod, String Ti, String Au, String Ge, int Ed)
    {
        setCodigo(Cod);
        setTitulo(Ti);
        setAutor(Au);
        setGenero(Ge);
        setEdicion(Ed);
    }
    //Pantalla principal
    void Mostrar()
    {
        JOptionPane.showMessageDialog(null, "Codigo"+""+getCodigo()+"\n"+"Titulo:"+""+getTitulo()+"\n"+"Autor:"+""+getAutor()+"\n"+"Genero:"+""+getGenero()+"\n"+"Edicion:"+""+getEdicion()+"\n");
    }
}