public class Ugly_I {
   
        public boolean isUgly(int n) {
            if(n<=0)  return false;
            if(n==1)  return true;
            while(n!=0)
            {
                
                    if(n==1)
                    {
                        return true;
                    }
                    if(n%2==0) n=n/2;
                    else if(n%3==0)n=n/3;
                    else if(n%5==0)n=n/5;
                    else
                    {
                        return false;
                    }
                
            }
            return true;
        }
        public static void main(String[] args) {
            Ugly_I object = new Ugly_I();
            System.out.println(object.isUgly(6));
        }
    }
    

