import java.util.ArrayList;
import java.util.Arrays;

public class BlockchainProgram {
    public static void main(String[] args) {
        //Demonstrate a Hash Function
        String statement1 = "My world is perfectly imperfect";
        int hashValue = statement1.hashCode();

        System.out.println("Statement = " + statement1 + " whose hash value = " + hashValue);

        //Hash an Array
        String [] list1 = {"chris","sandy","trevor"};
        String [] list2 = {"chris","sandy","Trevor"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("Hash 1 = " + hash1 + " Hash 2 = " + hash2);
        //Demonstrate a Series of Blocks in a Chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //Block One
        String[] intialValues = {"Shad has $700", "Miguel has $550"};
        Block firstBlock = new Block(intialValues,0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The Blockchain is " + blockChain.toString());
        //blockHash=1645480768

        //Block Two
        String[] shadGivesItAway = {"Shad gives Tim $40", "Shad gives Tany $60", "Shad gives Terry $100"};
        Block secondBlock = new Block(shadGivesItAway,firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The Blockchain is " + blockChain.toString());
        //blockHash=630749953

        //Block Three
        String[] shadGetsSomeBack = {"Tim gives Shad $100", "Terry gives $50 to Shad"};
        Block thirdBlock = new Block(shadGetsSomeBack,secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The Blockchain is " + blockChain.toString());
        //blockHash=843637674

    }
}
