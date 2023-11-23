package tests;

import org.testng.annotations.Test;

public class ThirdPageTest extends BaseTest {
    @Test
    public void checkInformationInVmClassString(){
        mainPageThird.openCloudPage();
        mainPageThird.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        mainPageThird.sendKeyInToNumberOfInstancesField("4");
        mainPageThird.selectSeriesOfMachine();
        mainPageThird.selectMachineType();
        mainPageThird.clickAddGpusCheckBox();
        mainPageThird.selectNumberOfGpus();
        mainPageThird.selectGpuType();
        mainPageThird.selectLocalSsd();
        mainPageThird.selectDataCenterLocation();
        mainPageThird.selectCommittedUsage();
        mainPageThird.pushAddToEstimate();
        mainPageThird.checkInformationInVmClassIsRegular();
    }

    @Test
    public void checkInformationInInstanceTypeString(){
        mainPageThird.openCloudPage();
        mainPageThird.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        mainPageThird.sendKeyInToNumberOfInstancesField("4");
        mainPageThird.selectSeriesOfMachine();
        mainPageThird.selectMachineType();
        mainPageThird.clickAddGpusCheckBox();
        mainPageThird.selectNumberOfGpus();
        mainPageThird.selectGpuType();
        mainPageThird.selectLocalSsd();
        mainPageThird.selectDataCenterLocation();
        mainPageThird.selectCommittedUsage();
        mainPageThird.pushAddToEstimate();
        mainPageThird.checkInformationInInstanceTypeIncludeN1Standard8();
    }

    @Test
    public void checkRegion(){
        mainPageThird.openCloudPage();
        mainPageThird.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        mainPageThird.sendKeyInToNumberOfInstancesField("4");
        mainPageThird.selectSeriesOfMachine();
        mainPageThird.selectMachineType();
        mainPageThird.clickAddGpusCheckBox();
        mainPageThird.selectNumberOfGpus();
        mainPageThird.selectGpuType();
        mainPageThird.selectLocalSsd();
        mainPageThird.selectDataCenterLocation();
        mainPageThird.selectCommittedUsage();
        mainPageThird.pushAddToEstimate();
        mainPageThird.checkRegionIsFrankfurt();
    }

    @Test
    public void checkLocalSsd(){
        mainPageThird.openCloudPage();
        mainPageThird.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        mainPageThird.sendKeyInToNumberOfInstancesField("4");
        mainPageThird.selectSeriesOfMachine();
        mainPageThird.selectMachineType();
        mainPageThird.clickAddGpusCheckBox();
        mainPageThird.selectNumberOfGpus();
        mainPageThird.selectGpuType();
        mainPageThird.selectLocalSsd();
        mainPageThird.selectDataCenterLocation();
        mainPageThird.selectCommittedUsage();
        mainPageThird.pushAddToEstimate();
        mainPageThird.checkLocalSsdSpace2x375Gib();
    }

    @Test
    public void checkCommitmentTerm(){
        mainPageThird.openCloudPage();
        mainPageThird.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        mainPageThird.sendKeyInToNumberOfInstancesField("4");
        mainPageThird.selectSeriesOfMachine();
        mainPageThird.selectMachineType();
        mainPageThird.clickAddGpusCheckBox();
        mainPageThird.selectNumberOfGpus();
        mainPageThird.selectGpuType();
        mainPageThird.selectLocalSsd();
        mainPageThird.selectDataCenterLocation();
        mainPageThird.selectCommittedUsage();
        mainPageThird.pushAddToEstimate();
        mainPageThird.checkCommitmentTermOneYear();
    }
}
