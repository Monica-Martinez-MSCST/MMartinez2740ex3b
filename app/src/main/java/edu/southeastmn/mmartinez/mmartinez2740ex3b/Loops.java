package edu.southeastmn.mmartinez.mmartinez2740ex3b;

/**
 * Created by moki on 4/4/2017.
 */

    public class Loops {
        String str = "";
        String[] tokens;
        int curIndex = 0;

        public Loops(String str) {
            super();
            this.str = str;
            tokens = str.split(" ");
        }

        public int getNext() {
            if (this.curIndex < tokens.length) {
                int value = Integer.parseInt(tokens[this.curIndex]);
                this.curIndex++;
                return value;
            }
            else return -1;
        }

        public String loop1() {
            this.curIndex = 0;
            StringBuilder str = new StringBuilder();
            int product = 0;
            while (product < 100)
            {
                int i = this.getNext();
                product = i * 10;
                str.append("Product = " + Integer.toString(product) + "\n");
            }
            return str.toString();
        }

        public String loop2() {
            this.curIndex = 0;
            StringBuilder str = new StringBuilder();
            int i = 0;
            do
            {
                i = this.getNext();
                int j = this.getNext();
                str.append(i + " + " + j + " = " + (i + j) + "\n");
            }
            while(this.curIndex < tokens.length -1);

            return str.toString();
        }

        public String loop3() {
            this.curIndex = 0;
            StringBuilder str = new StringBuilder();
            for(int total = 0; total <= 5 ; total ++)
            {
                str.append(Integer.toString(total*10) + "\n");
            }
            return str.toString();
        }

        public String loop4() {
            this.curIndex = 0;
            StringBuilder str = new StringBuilder();
            int total = 0;
            while(curIndex < tokens.length)
            {
                int i = this.getNext();
                total += i;
                str.append("Total + " + i + ": " + total + "\n");
            }
            return str.toString();
        }


    }
