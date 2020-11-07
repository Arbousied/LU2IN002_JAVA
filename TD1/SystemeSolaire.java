public class SystemeSolaire{
        public static void main(String[] args){
                Planete M = new Planete("Mercure", 2439.7);
                Planete T = new Planete("Terre", 6378.137);
                System.out.println(M.toString());
                System.out.println(T.getRayon());
        }
}

