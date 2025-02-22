# Spinner View Android Project

This is a simple Android project demonstrating the use of a **Spinner View** in Android Studio. The spinner allows users to select an option from a dropdown list.

## Features
- Uses **Spinner** to display a dropdown list.
- Populates the spinner with different ID card types.
- Uses **ArrayAdapter** to bind data to the Spinner.

## Project Structure
```
SpinnerView/
│-- app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/spinnerview/MainActivity.java
│   │   │   ├── res/layout/activity_main.xml
│   │   │   ├── AndroidManifest.xml
```

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/RAHULPATEL2002/SpinnerView.git
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle and build the project.
4. Run the application on an emulator or a physical device.

## Code Overview

### MainActivity.java
```java
public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> arrIds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        
        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);
    }
}
```

### AndroidManifest.xml
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.SpinnerView"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```


## Contributing
If you'd like to contribute, feel free to fork the repository and submit a pull request.


---
### Author
**Rahul Patel**  
[GitHub Profile](https://github.com/RAHULPATEL2002)

