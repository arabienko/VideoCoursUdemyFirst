package homeWork.lesson27;

public class lesson27 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");

        try {
            tiger.drink("voda");

            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally
            {
                System.out.println("this is the inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Tiger {

    public void eat(String str) {
        if (!str.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + str);
        }
        System.out.println("Tigr est myaso");

    }

    public void drink(String str) throws NeVodaException {
        if (!str.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + str);
        }
        System.out.println("Tigr pyet voda");
    }
}

class NeMyasoException extends RuntimeException {

    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {

    NeVodaException(String s) {
        super(s);
    }
}
