package com.example.synkora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity handling login validation logic and UI interaction.
 */
public class LoginValidation1 extends AppCompatActivity {

    // UI Element references
    private EditText etNameOrId;
    private EditText etPassword;
    private Button btnLogin;
    private TextView tvStatusResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_validation1);

        // Initialize UI components and set up event listeners
        initViews();
        setupListeners();
    }

    /**
     * Initializes all UI components from layout.
     */
    private void initViews() {
        etNameOrId = findViewById(R.id.editTextText2);
        etPassword = findViewById(R.id.editTextTextPassword);
        btnLogin = findViewById(R.id.button2);
        tvStatusResult = findViewById(R.id.textView3);
    }

    /**
     * Sets up click listeners for interactive UI components.
     */
    private void setupListeners() {
        btnLogin.setOnClickListener(v -> handleLogin());
    }

    /**
     * Handles the login action when the user taps the login button.
     */
    private void handleLogin() {
        String usernameOrId = etNameOrId.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (!validateInputs(usernameOrId, password)) {
            return;
        }

        boolean isSuccessful = checkCredentials(usernameOrId, password);
        if (isSuccessful) {
            updateStatus("Login successful!", true);
            Toast.makeText(this, "Welcome back!", Toast.LENGTH_SHORT).show();
        } else {
            updateStatus("Invalid username/student ID or password.", false);
        }
    }

    /**
     * Validates that required input fields are not empty.
     *
     * @param username The entered username or student ID.
     * @param password The entered password.
     * @return true if inputs are non-empty; false otherwise.
     */
    private boolean validateInputs(String username, String password) {
        if (username.isEmpty()) {
            etNameOrId.setError("Username or Student ID is required");
            etNameOrId.requestFocus();
            updateStatus("Please enter your Username or Student ID.", false);
            return false;
        }

        if (password.isEmpty()) {
            etPassword.setError("Password is required");
            etPassword.requestFocus();
            updateStatus("Please enter your password.", false);
            return false;
        }

        return true;
    }

    /**
     * Validates user credentials.
     *
     * @param username Entered username or student ID.
     * @param password Entered password.
     * @return true if credentials match valid criteria; false otherwise.
     */
    private boolean checkCredentials(String username, String password) {
        return ("2026001".equals(username) && "12345".equals(password))
                || ("admin".equalsIgnoreCase(username) && "12345".equalsIgnoreCase(password));
    }

    /**
     * Updates the status result TextView on the screen.
     *
     * @param message Message text to display.
     * @param isSuccess true if operation was successful; false otherwise.
     */
    private void updateStatus(String message, boolean isSuccess) {
        tvStatusResult.setText(message);
        tvStatusResult.setTextColor(isSuccess ? 0xFF2E7D32 : 0xFFC62828); // Green for success, Red for error
    }
}