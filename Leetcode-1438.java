1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

  public int longestSubarray(int[] nums, int limit) {
    int start = 0;
    int end = 0;
    int res = Integer.MIN_VALUE;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int n = nums.length;

    while (start < n && end < n) {
	/*Update the min and max of that window to calculate the abs diff*/
      min = Math.min(min, Math.min(nums[start], nums[end]));
      max = Math.max(max, Math.max(nums[start], nums[end]));
	  
	/*if abs diff is less than limit. Simply update the answer and increment the end of window*/
      if (Math.abs(max - min) <= limit) {
        res = Math.max(res, end - start + 1);
        end++;
      } else {
	  /*if abs diff in greater than limit. Then no need to check for remaining windows with this starting 
	  point. So reset the start & end. Also reset min & max because you don't want min & max from 
	  previous windows*/
        start++;
        end = start;
        min = nums[start];
        max = nums[start];
      }
    }
    return res;
    }
