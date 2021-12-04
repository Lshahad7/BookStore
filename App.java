import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // customer account objects
        Account c1=new Customer("shaalei", "Shahad", "12U890", "0505926755", "Dammam");
        Account c2=new Customer();


        // admin account objects
        Account a1=new Admin("boos01", "Shahad", "456#89", "05059357822", "Dammam");
        Account a2=new Admin();

        // agent account objects 
        Account d1=new Distributor("agent1", "David", "189H^80", "0505457955", "Riyadh");
        Account d2=new Distributor();
        Distributor d3=new Distributor();

        //Books objects
        Books b1=new Books();
        Books b2=new Books();
        Books b3=new Books();
        ArrayList<Books> newBooks=new ArrayList<Books>();


     // Journals Book objects
    Books j1=new Journals(1, "stories", 1, 190, 4, true);
    // StudyBooks Book Objects
    Books s1=new Studybooks(1, "Math", 2, 119, 8, true);
    // Magazines Book objects
    Books m1=new Magazines(1, "Vouge", 3, 100, 3, true);

    // total array list of books
    ArrayList<Books> totalBooks= new ArrayList<Books>();
    totalBooks.add(m1);
    totalBooks.add(s1);
    totalBooks.add(j1);
    Books.numOfBooks=totalBooks.size();
    // total array list of accounts 
    ArrayList<Account> totalAcc=new ArrayList<Account>();
    //customers
    totalAcc.add(c1);
    //admins
    totalAcc.add(a1);
    totalAcc.add(a2);
    //agents
    totalAcc.add(d1);
    Account.numOfAccount=totalAcc.size();
       
        Scanner input=new Scanner(System.in);
   
        int choice;
        boolean keepRolling=true;
        while(keepRolling){
        System.out.println("  ♥ SFK BookStore Welocmes You ♥  ");
        System.out.println("  ♥ Who is Using Our System Today ? ♥  ");
        System.out.println("  ♥ 1- Admin ♥  ");
        System.out.println("  ♥ 2- Customer ♥  ");
        System.out.println("  ♥ 3- Disturbuting Agent ♥  ");
        System.out.println("  ♥ 4- Exit The System♥  ");
        System.out.println("  ♥ Please Enter : ♥  ");
        choice=input.nextInt();
        switch(choice){
            case 1:
            boolean keepItUp=true;
            for(int i=0; i<totalAcc.size(); i++){
                if(totalAcc.get(i) instanceof Admin){
            while(keepItUp){
                System.out.println("  ♥ Hello Dear Admin!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Add Books ♥  ");
                System.out.println("  ♥ 4-Checks Number of Orders ♥  ");
                System.out.println("  ♥ 5-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                int what;
                what=input.nextInt();
                switch(what){
                    case 1:
                    do{
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Please enter a userName that satisfy the following conditions:\n" + 
                                "    1. start with characters \n" + 
                                "    2. Number of characters must be between 8 to 15.");
                        String username= input.next();
                            totalAcc.get(i).setUsername(username);
                        
                        System.out.println("\nPlease enter a Password that satisfy the following conditions:\n" + 
                                "    1. have at least eight characters.\n" + 
                                "    2. consists of only letters and digits.\n" +
                                "    3. must contain at least two digits.");
                        String pass= input.next();
                            totalAcc.get(i).setPassword(pass);
                        
                        
                        System.out.println("\nPlease enter your name:");
                        String name= input.next();
                            totalAcc.get(i).setName(name);
                        
                        
                        System.out.println("\nPlease enter your phone number:");
                        String phone_no= input.next();
                            totalAcc.get(i).setPhone_no(phone_no);
                    
                        System.out.println("\nPlease enter your address (city name):");
                        String addres= input.next();
                            totalAcc.get(i).setAddress(addres);
                        
                        }while(!totalAcc.get(i).SignUp());
                    break;
                    case 2:
                    System.out.println("--------------------------------------------------------------");
                    totalAcc.get(i).validateLogin();
                    break;
                    case 3:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Enter type of book you want to add:");
                    System.out.println("1 for journals :");
                    System.out.println("2 for studybooks :");
                    System.out.println("3 for magazines :");
                    int ch=input.nextInt();
                    newBooks.get(i).AddBooks(ch);
                    break;
                    case 4:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("The number of current orders are: "+ Order.numOfOrders);
                    System.out.println("Total Order:");
                    System.out.println(c1.getCart().getFinalOrder().getBookOrder());
                    break;
                    case 5:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println(" ♥♥ Bye Bye ♥♥ ");
                    keepItUp=false;
                    break;
                }

            }}}
                break;
            case 2:
            boolean keepgoing=true;
            for(int i=0; i<=totalAcc.size(); i++){
                if(totalAcc.get(i) instanceof Customer){
            while(keepgoing){
                int answer;
                Account temp =new Account();
                System.out.println("  ♥ Hello Dear Customer!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Order Books ♥  ");
                System.out.println("  ♥ 4-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                answer=input.nextInt();
                switch(answer){
                    case 1:
                    do{
                        
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("Please enter a userName that satisfy the following conditions:\n" + 
                                    "    1. start with characters \n" + 
                                    "    2. Number of characters must be between 8 to 15.");
                            String username= input.next();
                                totalAcc.get(i).setUsername(username);
                            
                            System.out.println("\nPlease enter a Password that satisfy the following conditions:\n" + 
                                    "    1. have at least eight characters.\n" + 
                                    "    2. consists of only letters and digits.\n" +
                                    "    3. must contain at least two digits.");
                            String pass= input.next();
                                totalAcc.get(i).setPassword(pass);
                            
                            
                            System.out.println("\nPlease enter your name:");
                            String name= input.next();
                          
                                totalAcc.get(i).setName(name);
                            
                            System.out.println("\nPlease enter your phone number:");
                            String phone_no= input.next();
                         
                                totalAcc.get(i).setPhone_no(phone_no);
                            
                            
                            
                            System.out.println("\nPlease enter your address (city name):");
                            String addres= input.next();
    
                                totalAcc.get(i).setAddress(addres);
            
                           
                                totalAcc.get(i).existAccount.add(totalAcc.get(i));
                                temp=totalAcc.get(i);
    
                        
                            }while(!temp.SignUp()); 
                    break;
                    case 2:
                    System.out.println("--------------------------------------------------------------");
                    totalAcc.get(i).validateLogin();
                    break;
                    case 3:
                    
                    System.out.println("--------------------------------------------------------------");
                    boolean keepGoing=true;
                    
        while(keepGoing){
        int ch;
        System.out.println("** Welcome To Shopping Cart System **");
        System.out.println("Enter 1 to add books");
        System.out.println("Enter 2 to romove books");
        System.out.println("Enter 3 to place order and show invoice ");
        System.out.println("Enter 4 to show invoice");
        System.out.println("Enter 5 to cancel order");
        System.out.println("Enter 6 to exit shopping cart system");
        ch=input.nextInt();
     switch(ch){
         case 1:
         
         // edit 
         for(int j=0; j<totalBooks.size(); j++){
             System.out.println("Book ID"+totalBooks.get(j).getBookID()+"Book Name :" +
         totalBooks.get(j).getName()+"Book Quantity : "+
         totalBooks.get(j).getQuantity()+"Book Price :"+
         totalBooks.get(j).getPrice());}
         System.out.println("--------------------------------------------------------------");
         System.out.println("Enter the type of book you want to add :");
         System.out.println("1 for journals :");
         System.out.println("2 for studybooks :");
         System.out.println("3 for magazines :");
         int choosenType=input.nextInt();
         if(choosenType==1){
            for(int j=0; j<totalBooks.size(); j++)
            if(totalBooks.get(j).getType()==1)
            totalAcc.get(i).getCart().AddBook(ch, c1, totalBooks.get(j));
        }
         if(choosenType==2){
             for(int j=0; j<totalBooks.size(); j++)
             if(totalBooks.get(j).getType()==2)
             totalAcc.get(i).getCart().AddBook(ch, c1, totalBooks.get(j));
         }
         if(choosenType==3){
            for(int j=0; j<totalBooks.size(); j++)
            if(totalBooks.get(j).getType()==3)
            totalAcc.get(i).getCart().AddBook(ch, c1, totalBooks.get(j));
        }
   
         break;
         case 2:
         System.out.println("--------------------------------------------------------------");
         System.out.println("Enter the type of book you want to remove :");
         System.out.println("1 for journals :");
         System.out.println("2 for studybooks :");
         System.out.println("3 for magazines :");
         int removeType=input.nextInt();
         if(removeType==2){
            for(int j=0; j<totalBooks.size(); j++)
            if(totalBooks.get(j).getType()==2)
            totalAcc.get(i).getCart().RemoveBook(ch, c1, totalBooks.get(j));
        }
        if(removeType==3){
            for(int j=0; j<totalBooks.size(); j++)
            if(totalBooks.get(i).getType()==3)
            totalAcc.get(i).getCart().RemoveBook(ch, c1, totalBooks.get(j));
        } 
         break;
         case 3:
         System.out.println("--------------------------------------------------------------");
         c1.getCart().PlaceOrder(c1, c1.getCart().getOrder());
         c1.getCart().showBill(c1);
         break;
         case 4:
         System.out.println("--------------------------------------------------------------");
         c1.getCart().showBill(c1);
         break;
         case 5:
         System.out.println("--------------------------------------------------------------");
         c1.getCart().cancelOrder(c1);
         break; 
         case 6: System.out.println("Thank you for shopping with us");
         keepGoing=false;

     }
    }
                    break;
                    case 4:
                    System.out.println("");
                System.out.println(" ♥♥ Bye Bye ♥♥ ");
                System.out.println("");
                keepgoing=false;
                    break;
                }
            }}}
                
            
        
                break;
                case 3:
                boolean rollIt=true;
                for(int i=0; i<=totalAcc.size(); i++){
                    if(totalAcc.get(i) instanceof Distributor){
            while(rollIt){
                System.out.println("  ♥ Hello Dear Agent!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Checks Orders♥  ");
                System.out.println("  ♥ 4-Calculates Delivary fee♥  ");
                System.out.println("  ♥ 5-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                int what;
                what=input.nextInt();
                switch(what){
                    case 1:
                    do{
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Please enter a userName that satisfy the following conditions:\n" + 
                                "    1. start with characters \n" + 
                                "    2. Number of characters must be between 8 to 15.");
                        String username= input.next();
                            totalAcc.get(i).setUsername(username);
                        
                        System.out.println("\nPlease enter a Password that satisfy the following conditions:\n" + 
                                "    1. have at least eight characters.\n" + 
                                "    2. consists of only letters and digits.\n" +
                                "    3. must contain at least two digits.");
                        String pass= input.next();
                            totalAcc.get(i).setPassword(pass);
                        
                        
                        System.out.println("\nPlease enter your name:");
                        String name= input.next();
                            totalAcc.get(i).setName(name);
                        
                        
                        System.out.println("\nPlease enter your phone number:");
                        String phone_no= input.next();
                            totalAcc.get(i).setPhone_no(phone_no);
                        
                        
                        
                        System.out.println("\nPlease enter your address (city name):");
                        String addres= input.next();
                            totalAcc.get(i).setAddress(addres);
                        
                            totalAcc.get(i).existAccount.add(totalAcc.get(i));
                        }while(!totalAcc.get(i).SignUp());
                    break;
                    case 2:
                    //login
                    break;
                    case 3:
                    if(totalAcc.get(i) instanceof Customer)
                    d3.setDeliveryStatus(totalAcc.get(i).getCart().getDeliverReq());
                    break;
                    case 4:
                    if(totalAcc.get(i) instanceof Customer)
                    d3.Deliveryfee(totalAcc.get(i).getCart().getDistance());
                    break;
                    case 5:
                    System.out.println("");
                System.out.println(" ♥♥ Bye Bye ♥♥ ");
                System.out.println("");
                rollIt=false;
                    break;
                }
            }}}
                break;
                case 4: System.out.println(" ♥♥ Thank You For Using Our System We Wish You A Pleasent Day ♥♥ ");
                keepRolling=false;
                break;
            
        }

    }
}
}
