package com.xworkz.assoication.software;

public class Version {
    String versionName;
    Feature[] features = new Feature[5];
    int featureCount = 0;

    public Version(String versionName) {
        this.versionName = versionName;
    }

    public void addFeature(Feature feature) {
        features[featureCount++] = feature;
    }

    public void showFeatures() {
        System.out.println("  Version: " + versionName);
        for (int i = 0; i < featureCount; i++) {
            System.out.println("    - " + features[i]);
        }
    }
}
