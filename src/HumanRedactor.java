public class HumanRedactor {


    public Human[] addHuman(Human[] arr, Human human) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = human;
                return arr;
            }
        }
        return arr;
    }


    public Human[] readHuman(Human[] arr, Human human) {
        return arr;
    }

    public Human[] updateHuman(Human[] arr, Human human, int index) {
        for (int i = 0; i < arr.length; i++) {
            arr[index] = human;
            return arr;
        }

        return arr;
    }

    public Human[] deleteHuman(Human[] arr, Human human, int index) {
        for (int i = 0; i < arr.length; i++) {
            arr[index] = null;
            return arr;
        }
        return arr;
    }


}
