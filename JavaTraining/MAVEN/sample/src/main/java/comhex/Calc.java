package comhex;

public class Calc{
    
    int v1;
    int v2;

    Calc(int argV1, int argV2)
    {
        this.v1 = argV1;
        this.v2 = argV2;

    }
    int mul()
    {
        return v1 * v2;
    }
    int add()
    {
        return v1 + v2;
    }

}