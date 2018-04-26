package tools;

public class Wait {

    public Wait(){}

    public void wait(int seconds) {
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException c){
           c.printStackTrace();
        }catch(Exception c){
            c.printStackTrace();
        }
    }
}
