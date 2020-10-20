import java.util.*;

public class Main {
      public static void main(String[] args){
          List<Llapis> Lista1 = new ArrayList<>();
          List<Llapis> Lista2 = new ArrayList<>();

//DATOS DE LA CAJA 1 SOLO COLOR
          for (int i=0; i<10; i++){
              int C = (int) (Math.random()*7+1);
              Lista1.add(new Llapis(C));
          }

          //comprovar si funciona
          System.out.println("Caja 1");
          for (Llapis c : Lista1){
              System.out.println(c);
          }
//DATOS DE LA CAJA 2 COLOR Y GRUIX

          for (int i=0; i<10; i++){
              int C = (int) (Math.random()*7+1);
              int G = (int) (Math.random()*3);
              Lista2.add(new Llapis(C,G));

          }
          //comprovar si funciona
          System.out.println("Caja 2");
          for (Llapis c : Lista2){
              System.out.println(c);
          }
//ORDENAR LAPICES POR COLOR DE MAS GRANDE A MAS PEQUEÑO
          Collections.sort(Lista1);
          System.out.println("ORDENADO");
          System.out.println("Caja 1");
          for (Llapis c : Lista1){
              System.out.println(c);
          }
      }
}
