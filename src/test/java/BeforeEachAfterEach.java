import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BeforeEachAfterEach {

    JavaOperations javaOperations;

    @BeforeEach
    public void init(){
        javaOperations = new JavaOperations();
        // all init tasks
        System.out.println("Initialization done");
    }

    @AfterEach
    public void cleanUp(){
        System.out.println("Cleanup done");
    }

    @Test
    void addTest(){
        System.out.println("First test .. using JavaOperations");
    }

    @Test
    void multiplyTest(){
        System.out.println("Second test .. using JavaOperations");
    }
}