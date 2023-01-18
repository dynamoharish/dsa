
class listmethods{
    

}


public class listadt{
   public static void main(String args[]){
    int value,position;
    Scanner sc=new Scanner(System.in);
   while(true){
    System.out.pritnln("Main Menu");
    System.out.pritnln("1.Insert at end\n");
    System.out.pritnln("2.Display the list\n");
    System.out.pritnln("3.Insert at specified Position\n");
    System.out.pritnln("4.Delete at specified Position\n");
    System.out.pritnln("5.Exit\n");
    System.out.println("Enter your choice:\t");
    int choice = sc.nextInt();

    switch(choice){
        case 1:
        System.out.println("Enter the data");
        value = sc.nextInt();
        add(value);
        break;

        case 2:
        System.out.println("Elements in the list are: ");
        display();
        break;

        case 3:
        System.out.println("Enter the Position you want to insert: ");
        position = sc.nextInt();
        if(position <0){
            System.out.println("Wrong position");
            break;
        }
        System.out.println("Enter the value: ");
        val =sc.nextInt();
        list.insertAtPos(pos,val);

        case 4:
        System.out.println("Enter the position you want to delete: ");
        position = sc.nextInt();
        list.deleteAtPos(pos,val);

        case 5:
        System.exit(0);

        default:
            System.out.println("Enter the Correct choice!!!");
    }

   }




   } 

}