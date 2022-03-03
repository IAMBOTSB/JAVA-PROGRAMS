public class BookByCategory
{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        while(sc.hasNextLine()){
            String str=sc.nextLine();

            switch(str){

                case "comics":System.out.println("Disney Adventures\nHarryPotter\nDonald Duck Adventures");
                    break;
                case "fiction":System.out.println("Abandon\nWings of Fire\nPrayer Moon\nGreen Tea");
                    break;
                case "fairytales":System.out.println("The Haunted Castle\nThe Happy Prince and Other Tales\nA House of Pomegranates");
                    break;
                default:System.out.println("No Books Available");
            }
        }
    }
}
