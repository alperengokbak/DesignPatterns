package Lab4_Quiz;

public class Main {
    public static void main(String[] args) {
        Server onDemandE2_HighCpu2 = new OnDemandE2_HighCpu2();
        onDemandE2_HighCpu2 = new PreEmtibleCpu(onDemandE2_HighCpu2);
        onDemandE2_HighCpu2 = new PreEmtibleCpu(onDemandE2_HighCpu2);

        onDemandE2_HighCpu2 = new OnDemandMemory(onDemandE2_HighCpu2);
        onDemandE2_HighCpu2 = new OnDemandMemory(onDemandE2_HighCpu2);
        onDemandE2_HighCpu2 = new OnDemandMemory(onDemandE2_HighCpu2);
        onDemandE2_HighCpu2 = new OnDemandMemory(onDemandE2_HighCpu2);

        System.out.println(onDemandE2_HighCpu2.getDescription());
        System.out.println(onDemandE2_HighCpu2.cost());

        Server preEmtibleE2_HighCpu2 = new PreEmptibleE2_HighCpu2();
        preEmtibleE2_HighCpu2 = new OnDemandCpu(preEmtibleE2_HighCpu2);
        preEmtibleE2_HighCpu2 = new OnDemandCpu(preEmtibleE2_HighCpu2);

        preEmtibleE2_HighCpu2 = new OnDemandMemory(preEmtibleE2_HighCpu2);
        preEmtibleE2_HighCpu2 = new OnDemandMemory(preEmtibleE2_HighCpu2);
        preEmtibleE2_HighCpu2 = new PreEmtibleMemory(preEmtibleE2_HighCpu2);
        preEmtibleE2_HighCpu2 = new PreEmtibleMemory(preEmtibleE2_HighCpu2);
        
        System.out.println(preEmtibleE2_HighCpu2.getDescription());
        System.out.println(preEmtibleE2_HighCpu2.cost());
    }
}
