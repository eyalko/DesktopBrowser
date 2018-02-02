package mavenTest;

public class runner {

    private static final int numOfFirefox= 1;
    private static final int numOfChrome= 1;
    private static final int numOfIE= 1;
    private static final int numOfIos= 0;
    private static final int numOfAndroid= 0;

    public static void main(String[] args) {

//        for  (int a=0 ; a<numOfAndroid; a++) {
//            myTests test= new myTests(PlatformType.ANDROID, "Android test #"+(a+1));
//            Thread t1= new Thread(test);
//            t1.start();
//        }
//        for  (int a=0 ; a<numOfIos; a++) {
//            myTests test= new myTests(PlatformType.IOS, "IOS test #"+(a+1));
//            Thread t1= new Thread(test);
//            t1.start();
//        }
        for  (int a=0 ; a<numOfIE; a++) {
            seleniumTest test= new seleniumTest("internet explorer");
            Thread t1= new Thread(test);
            t1.start();
        }
        for  (int a=0 ; a<numOfChrome; a++) {
        	seleniumTest test= new seleniumTest("chrome");
            Thread t1= new Thread(test);
            t1.start();
        }
        for  (int a=0 ; a<numOfFirefox; a++) {
        	seleniumTest test= new seleniumTest("firefox");
            Thread t1= new Thread(test);
            t1.start();
        }
        
//        for  (int a=0 ; a<numOfFirefox; a++) {
//            myTests test= new myTests(PlatformType.FIREFOX, "57", "Firefox test #"+(a+1));
//            Thread t1= new Thread(test);
//            t1.start();
//        }

    }

}
