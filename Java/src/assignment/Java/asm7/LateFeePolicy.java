package assignment.asm7;

public interface LateFeePolicy {
    double applyPolicy(double baseFee);
    String getPolicyName();
}
