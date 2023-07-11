public class ArithmeticalOperations {

    int x, y, z; char o, o2;
    int result;

    public void calculation (int firstNumber, char operator, int secondNumber) throws NonValidOperatorException {
        // 1 constructor
        this.x = firstNumber;
        this.y = secondNumber;
        this.o = operator;

        switch (o) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                throw new NonValidOperatorException("Non valid operator");
        }
    }

    //Overload
    public void calculation (int overloadFirstNumber, char o, int overloadSecondNumber, char o2, int overloadThirdNumber) throws NonValidOperatorException {
        // 2 constructor
        this.x = overloadFirstNumber;
        this.y = overloadSecondNumber;
        this.z = overloadThirdNumber;

        this.o = o;
        this.o2 = o2;

        switch (o) {
            // + and other
            case '+':
                switch (o2) {
                    case '+':
                        result = overloadFirstNumber + overloadSecondNumber + overloadThirdNumber;
                        break;
                    case '-':
                        result = overloadFirstNumber + overloadSecondNumber - overloadThirdNumber;
                        break;
                    case '*':
                        result = overloadFirstNumber + overloadSecondNumber * overloadThirdNumber;
                        break;
                    case '/':
                        result = overloadFirstNumber + overloadSecondNumber / overloadThirdNumber;
                        break;
                }
                break;

            // - and other
            case '-':
                switch (o2) {
                    case '+':
                        result = overloadFirstNumber - overloadSecondNumber + overloadThirdNumber;
                        break;
                    case '-':
                        result = overloadFirstNumber - overloadSecondNumber - overloadThirdNumber;
                        break;
                    case '*':
                        result = overloadFirstNumber - overloadSecondNumber * overloadThirdNumber;
                        break;
                    case '/':
                        result = overloadFirstNumber - overloadSecondNumber / overloadThirdNumber;
                        break;
                }
                break;

            // * and others
            case '*':
                switch (o2) {
                    case '+':
                        result = overloadFirstNumber * overloadSecondNumber + overloadThirdNumber;
                        break;
                    case '-':
                        result = overloadFirstNumber * overloadSecondNumber - overloadThirdNumber;
                        break;
                    case '*':
                        result = overloadFirstNumber * overloadSecondNumber * overloadThirdNumber;
                        break;
                    case '/':
                        result = overloadFirstNumber * overloadSecondNumber / overloadThirdNumber;
                        break;
                }
                break;

                // / and other
            case '/':
                switch (o2) {
                    case '+':
                        result = overloadFirstNumber / overloadSecondNumber + overloadThirdNumber;
                        break;
                    case '-':
                        result = overloadFirstNumber / overloadSecondNumber - overloadThirdNumber;
                        break;
                    case '*':
                        result = overloadFirstNumber / overloadSecondNumber * overloadThirdNumber;
                        break;
                    case '/':
                        result = overloadFirstNumber / overloadSecondNumber / overloadThirdNumber;
                        break;
                }
                break;
            default: throw new NonValidOperatorException("Non valid operator or operators");
        }
    }
}
