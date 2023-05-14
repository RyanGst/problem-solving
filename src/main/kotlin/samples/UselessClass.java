package samples;

final class UselessClass {
    private UselessClass() {
        throw new AssertionError();
    }
}

class Test {
    public static void main(String[] args) {
        //UselessClass uselessClass = new UselessClass();
    }
}


