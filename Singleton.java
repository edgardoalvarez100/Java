package singleton;
public class Singleton {
    

private static int num=3;
private static int cont=0;

private Singleton(){
     cont=cont+1;
      System.out.println("Creada la instancia " + cont + " ");
    }
 public static Singleton NuevoObjeto (){
     if(cont>=num){
         System.out.println("Error ya existen " + cont + " instancias creadas");
         return null;
     }else{
        
         return  new Singleton();
     }
            
 }
  
    public static void main(String[] args) {
        // TODO code application logic here
       Singleton a = NuevoObjeto();
       Singleton b = NuevoObjeto();
       Singleton c = NuevoObjeto();
       Singleton d = NuevoObjeto();
                  
    }
 
}
