// Demonstration of Single-level, Multi-level, and Hierarchical Inheritance in Java

// ===== 1. Single-level Inheritance =====
class BaseClass 
{ // Parent
    void displayBase() 
    {
        System.out.println("This is the BaseClass.");
    }
}

class SubClass extends BaseClass 
{ // Child
    void displaySub() 
    {
        System.out.println("This is the SubClass (Single-level).");
    }
}

// ===== 2. Multi-level Inheritance =====
class SubSubClass extends SubClass 
{ // Grandchild
    void displaySubSub() 
    {
        System.out.println("This is the SubSubClass (Multi-level).");
    }
}

// ===== 3. Hierarchical Inheritance =====
class AnotherSubClass extends BaseClass 
{ // Another child of BaseClass
    void displayAnotherSub() 
    {
        System.out.println("This is AnotherSubClass (Hierarchical).");
    }
}

// ===== Main class =====
public class all_inheritance 
{
    public static void main(String[] args) 
    {
        
        // Single-level
        System.out.println("--- Single-level Inheritance ---");
        SubClass obj1 = new SubClass();
        obj1.displayBase();
        obj1.displaySub();
        
        // Multi-level
        System.out.println("\n--- Multi-level Inheritance ---");
        SubSubClass obj2 = new SubSubClass();
        obj2.displayBase();
        obj2.displaySub();
        obj2.displaySubSub();
        
        // Hierarchical
        System.out.println("\n--- Hierarchical Inheritance ---");
        AnotherSubClass obj3 = new AnotherSubClass();
        obj3.displayBase();
        obj3.displayAnotherSub();
    }
}
