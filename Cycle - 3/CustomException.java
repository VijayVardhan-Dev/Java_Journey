class PassChecker extends Exception{
    PassChecker(String message){
        super(message);
    }
}

class CustomException{

    static public void attandanceChecker(int a) throws PassChecker{
        if (a < 75){
            throw new PassChecker("Reels chudakapothe pass avuthav");
        }
        else{
            System.out.println("chaduvu bidda");
        }
    }
    public static void main(String[] args) {
        try{
            attandanceChecker(74);
        }catch(PassChecker e){
            System.out.println(e);
        }
    }
}
