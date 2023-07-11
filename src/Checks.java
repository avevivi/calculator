public class Checks extends Main {

    public void checkArrayLength(String[] array) throws IncorrectInputException {
        if (array.length != 3 && array.length != 5) {
            throw new IncorrectInputException("Incorrect input");
        }
    }


    public void checkScannerInput(int x, int y) throws IncorrectInputException {

        if (x < 1 || x > 10) {
           throw new IncorrectInputException("First number must be number from 1 to 10 inclusive");
        } else if (y < 1 || y > 10) {
            throw new IncorrectInputException("Second number must be number from 1 to 10 inclusive");
        }
    }

    public void checkScannerInput(int x, int y, int z) throws IncorrectInputException {

        if (x < 1 || x > 10) {
            throw new IncorrectInputException("First number must be number from 1 to 10 inclusive");
        } else if (y < 1 || y > 10) {
            throw new IncorrectInputException("Second number must be number from 1 to 10 inclusive");
        } else if (z < 1 || z > 10) {
            throw new IncorrectInputException("Third number must be number from 1 to 10 inclusive");
        }
    }
}
