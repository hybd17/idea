package csa03;

public class operation {
}

    class add implements Computer {
        @Override
        public int computer(int m, int n) {
            return m + n;
        }
    }

    class delete implements Computer {
        @Override
        public int computer(int m, int n) {
            return m - n;
        }
    }

    class mutiply implements Computer {
        @Override
        public int computer(int m, int n) {
            return m * n;
        }
    }

    class divide implements Computer {
        @Override
        public int computer(int m, int n) {
            return m / n;
        }
    }
