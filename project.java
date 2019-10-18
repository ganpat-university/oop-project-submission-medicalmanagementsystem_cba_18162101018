
import java.util.*;
import java .io.Console;
class Patient_det {
public int id;
public String Name;
public int age;
public String disease;
public long phn;
public String blood_grp;
public int weight;
public String gender;
public String username;
public char[] pswd;
public String pswd3;
public int len;
public String str,str1;

void get_inform()
{
    System.out.println("Enter Name :");
    Scanner sc=new Scanner(System.in);
    Console cons= System.console();
    Name=sc.nextLine();
    System.out.println("Enter Age :");
    age=sc.nextInt();
    System.out.println("Enter Disease :");
    disease=sc.next();
    System.out.println("Enter Contact Number :");
    phn=sc.nextLong();
    System.out.println("Enter Blood Group :");
    blood_grp=sc.next();
    System.out.println("Enter Weight :");
    weight=sc.nextInt();
    System.out.println("Enter Gender :");
    gender=sc.next();
    System.out.println("Enter Username");
    username=sc.next();
    System.out.println("Enter Password");
    pswd=cons.readPassword();
    //pswd3=pswd.toString();
    pswd3=String.valueOf(pswd);
    //System.out.println("Re-enter Password");
    //pswd1=console.readPassword();
    /*str=new String(pswd);
 dtghjuu   str1=new String(pswd1);


    if(str1.compareTo(str)==0)
    {
        System.out.println("Password doesn't match");
    }*/



}
  public static void main(String args[])
    {
        Console cons1= System.console();
        int i,choice,check=1,j=0,r=1,choice1,up,con=1,choice2,temp=93;
        String userm,userm1;
        String passm,passm1;
        char[] pass5;
        char[] pswd9;
        char[] pswd8;
        Patient_det[] ob=new Patient_det[10];
        for(i=0;i<=9;i++)
        {
            ob[i]=new Patient_det();
        }
        System.out.println("===================================================");
        System.out.println("                 Medical Registration");
        System.out.println("===================================================");
        while(check==1)
        {
System.out.println();
System.out.println();
System.out.println();
        System.out.println("Press 1 For Registration");
        System.out.println("Press 2 For Login");
        System.out.println("Press 3 For Delete Your Account");
        Scanner sc1=new Scanner(System.in);
        choice=sc1.nextInt();
        if(choice==1)
        {
           ob[j].get_inform();
           j++;
        }
        else if(choice==2)
        {
System.out.println();
System.out.println();
            System.out.println("Enter Your Username:");
            userm=sc1.next();
            System.out.println("Enter Password:");
            pass5=cons1.readPassword();
            passm=String.valueOf(pass5);
            for(i=0;i<j;i++)
            {
                if(i==temp)
                {
                    if(ob[i].username.compareTo(userm)==0)
                    {
                    if(ob[i].pswd3.compareTo(passm)==0)
                    {
System.out.println();
                        System.out.println("Your Account Has been Deleted, Create a New One");
                    }

                    }

                }
                else{
                if(ob[i].username.compareTo(userm)==0)
                {
                    if(ob[i].pswd3.compareTo(passm)==0)
                    {
System.out.println();
                        System.out.println("You are Logged in Succesfully");
                        con=1;
                        while(con==1)
                        {
System.out.println();
System.out.println();
System.out.println();
                        System.out.println("Press 1 To See Details");
                        System.out.println("Press 2 To See the Medicines");
                        System.out.println("Press 3 For Log out");
                        choice1=sc1.nextInt();
                        if(choice1==1)
                        {
System.out.println();
System.out.println();
                            System.out.println("==============Details===============");
                            System.out.println("Name: "+ob[i].Name);
                            System.out.println("Age: "+ob[i].age);
                            System.out.println("Disease: "+ob[i].disease);
                            System.out.println("Blood Group: "+ob[i].blood_grp);
                            System.out.println("Weight: "+ob[i].weight);
                            System.out.println("Gender: "+ob[i].gender);
                            System.out.println("====================================");
                            r=1;
                            while(r==1)
                            {
System.out.println();
                            System.out.println("Press 1 to change the details");
                            System.out.println("Press 2 to move to the  previous step");
                            up=sc1.nextInt();
                            if(up==1)
                            {
System.out.println();
System.out.println();
                                System.out.println("Press 1 to change the age");
                                System.out.println("Press 2 to change the weight");
                                System.out.println("Press 3 to change the gender");
                                System.out.println("Press 4 to change the Password");
                                choice2=sc1.nextInt();
                                if(choice2==1)
                                {
                                    System.out.println("Enter the new age:");
                                    ob[i].age=sc1.nextInt();
                                    System.out.println("Your Age is Updated Succesfully");
                                }
                                if(choice2==2)
                                {
                                    System.out.println("Enter the new weight:");
                                    ob[i].weight=sc1.nextInt();
                                    System.out.println("Your Weight is Updated Successfully");
                                }
                                if(choice2==3)
                                {
                                    System.out.println("Enter Gender:");
                                    ob[i].gender=sc1.next();
                                    System.out.println("Your Gender is Updated Successfully");
                                }
                                if(choice2==4)
                                {
                                    System.out.println("Enter New Password");
                                    pswd8=cons1.readPassword();
                                    ob[i].pswd3=String.valueOf(pswd8);
                                    System.out.println("Your Password is Updated Successfully");
                                }
                            }
                            if(up==2)
                            {
                                r=2;
                            }
                            }
                        }
                        if(choice1==2)
                        {
                          if(ob[i].disease.compareTo("diabetes")==0)
                        { System.out.println("==============================================");
                          System.out.println("Insulin           Price:300      Instock");
                          System.out.println("Nutre Diabe -90   Price:180      Instock");
                          System.out.println("==============================================");
                        }
                        if(ob[i].disease.compareTo("headache")==0)
                        {

                          System.out.println("==============================================");
                          System.out.println("Paracetamol   500mg    Price:45    Instock");
                          System.out.println("Crocin        300mg    Price:70    Instock");
                          System.out.println("==============================================");
                        }
                        }
                        if(choice1==3)
                        {
                            con=2;

                        }






                        }

                    }
                }

            }
            }
        }
        else if(choice==3)
        {
            System.out.println("Enter Your Username:");
            userm1=sc1.next();
            System.out.println("Enter Your Password:");
            pswd9=cons1.readPassword();
            passm1=String.valueOf(pswd9);
            for(i=0;i<j;i++)
            {
                if(ob[i].username.compareTo(userm1)==0)
                {
                    if(ob[i].pswd3.compareTo(passm1)==0)
                    {
                        temp=i;
                        System.out.println("The Account is Deleted Successfully");
                    }
        }
        else
        {
          System.out.println("The Password and Username U entered does not match :)");
        }



    }
}
}
    }
}
