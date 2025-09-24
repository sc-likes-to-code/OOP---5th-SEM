//package oops.lab1;

import java.util.*;

class InvoiceTest
{
    String p_no, p_desc;
    int q;
    double p_item;

    InvoiceTest()
    {
        this.p_no="1234";
        this.p_desc="Hammer";
        this.q=2;
        this.p_item=14.95;
    }

    void set_pno(String p_no2)
    {
        p_no=p_no;
    }

    String get_pno()
    {
        return p_no;
    }

    void set_pdesc(String p_desc)
    {
        this.p_desc=p_desc;
    }

    String get_pdesc()
    {
        return p_desc;
    }

    void set_q(int q)
    {
        this.q=q;
    }

    int get_q()
    {
        return q;
    }

    void set_pitem(double p_item)
    {
        this.p_item=p_item;
    }

    double get_pitem()
    {
        return p_item;
    }

    double getInvoiceAmount()
    {
        double inv_amt=q*p_item;
        return inv_amt;
    }
}

public class invoice
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);

        String p_no,p_desc;
        int q;
        double p_item;

        InvoiceTest ob = new InvoiceTest();

        System.out.println("Original Invoice Information:\n");
        System.out.println("Part Number: "ob.get_pno());
        System.out.println("Description: "+ob.get_pdesc());
        System.out.println("Quantity: "+ob.get_q());
        System.out.println("Price: "+ob.get_pitem());
        System.out.println("Invoice amount: "+ob.getInvoiceAmount());

        System.out.println("Updated Invoice Information:\n");
        System.out.println("Part number: ");
        p_no=sc2.nextLine();
        System.out.println("Description: ");
        p_desc=sc2.nextLine();
        System.out.println("Quantity: ");
        q=sc.nextInt();
        System.out.println("Price: ");
        p_item=sc3.nextDouble();
        System.out.println("Invoice amount: "+ob.getInvoiceAmount());

        ob.set_pno(p_no);
        ob.set_pdesc(p_desc);
        ob.set_q(q);
        ob.set_pitem(p_item);
        
        System.out.println("Original Invoice Information:\n");
        System.out.println("Part number: "+ob.get_pno());
        System.out.println("Description: "+ob.get_pdesc());
        System.out.println("Quantity: "+ob.get_q());
        System.out.println("Price: "+ob.get_pitem());
        System.out.println("Invoice amount: "+ob.getInvoiceAmount());

        System.out.println("Updated Invoice Information\n");
    }
}