package com.company;

public class PATTERNS {
    public static void main(String[] args)
    {
        //1.pattern 1
        //12345
        //12345
        //12345
        //12345
        //12345
        //for(int i=1;i<=5;i++)
        //{
        //    for(int j=1;j<=5;j++)
        //    {
        //        System.out.print(j+" ");
        //    }
        //
        //    System.out.println("");
        //}
//----------------------------------------------------------------------------------------------------------------------

        //2.PATTERN 2
        //11111
        //22222
        //33333
        //44444
        //55555

       // for(int i=1; i<=5; i++)
        //{
          //  for(int j=1; j<=5; j++)
            //{
              //  System.out.print(i+" ");
            //}
            //System.out.println("");
        //}
//----------------------------------------------------------------------------------------------------------------------

        //3.PATTERN
        //23456
        //34567
        //45678
        //56789
        //678910

      //  for(int i=1; i<=5; i++)
      //  {
      //      for(int j=1; j<=5; j++)
      //      {
      //          System.out.print(i+j+" ");
       //     }
        //    System.out.println("");
        //}
//----------------------------------------------------------------------------------------------------------------------
        //PATTERN 4.
        //12345
        //678910
        //1112131415
        //1617181920
        //2122232425
        int count = 0;
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1; j<=5; j++)
            {
                ++count;
                System.out.print(count +" ");
            }

            System.out.println("");
        }
//----------------------------------------------------------------------------------------------------------------------






    }
}
