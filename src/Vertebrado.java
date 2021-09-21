public class Vertebrado {
   protected String nombreVertebrado;  
   protected String claseVertebrado; // valores:mamífero, ave, pez, reptil, anfibio
   
   // rompedor
   public Vertebrado(String nombreVertebrado, String claseVertebrado){
       this.nombreVertebrado = nombreVertebrado;
       this.claseVertebrado = claseVertebrado;
   }
   
      
   public void setNombreVertebrado( String nombreVertebrado) 
   {
       this.nombreVertebrado = nombreVertebrado;
   }

   public String getNombreVertebrado()
   {
       return nombreVertebrado;
   }

   public void setClaseVertebrado( String claseVertebrado) 
   {
      this.claseVertebrado = claseVertebrado;
   }
   public String getClaseVertebrado()
   {
       return claseVertebrado;
   } 
}
