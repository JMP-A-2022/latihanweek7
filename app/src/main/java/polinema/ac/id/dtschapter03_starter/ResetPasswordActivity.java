package polinema.ac.id.dtschapter03_starter;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Reset Password");
    }
    public void changePassword(View view) {
        Intent a = new Intent(ResetPasswordActivity.this, LoginActivity.class);
        startActivity(a);
        finish();
    }
}