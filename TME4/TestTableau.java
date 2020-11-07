public class TestTableau{
  public static void main(String[] args){
    TableauInt t1 = new TableauInt();
    TableauInt t2 = new TableauInt(0);
    TableauInt t3 = new TableauInt(0);
    System.out.println(t1.toString());
    System.out.println(t1.somme());
    System.out.println(t1.rangMax());
    System.out.println(t2.toString());
    System.out.println(t2.somme());
    System.out.println(t2.rangMax());
    System.out.println(t2.egal(t3));
  }
}
