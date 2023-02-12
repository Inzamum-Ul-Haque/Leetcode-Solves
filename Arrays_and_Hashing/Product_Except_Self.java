
package Arrays_and_Hashing;

public class Product_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length + 2];
        int[] post = new int[nums.length + 2];
        int[] temp = new int[nums.length + 1];
        int[] output = new int[nums.length];
        pre[0] = 1;
        pre[1] = 1;
        pre[pre.length - 1] = 1;
        post[0] = 1;
        post[1] = 1;
        post[post.length - 1] = 1;

        for (int i = 0; i < nums.length; i++) {
            pre[i + 1] = pre[i] * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            post[i + 1] = post[i + 2] * nums[i];
        }
        
        for(int i=1;i<=temp.length-1;i++){
            temp[i] = pre[i-1] * post[i+1];
        }
        
        for(int i=1;i<=temp.length-1;i++){
            output[i-1] = temp[i];
        }

        return output;
    }
}
