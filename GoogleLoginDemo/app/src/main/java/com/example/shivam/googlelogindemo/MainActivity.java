package com.example.shivam.googlelogindemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {
    LinearLayout linear1,linear2;
    TextView txtEmail,txtName;
    ImageView imgView;
    Button btnLogout;
    GoogleApiClient googleApiClient;
    SignInButton signInButton;
    static  int REQ_CODE=9001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear1=(LinearLayout)findViewById(R.id.linear1);
        linear2=(LinearLayout)findViewById(R.id.linear2);
        imgView=(ImageView)findViewById(R.id.ImgView);
        txtEmail=(TextView)findViewById(R.id.txtEmail);
        txtName=(TextView)findViewById(R.id.txtName);
        btnLogout=(Button)findViewById(R.id.btnLogout);
         signInButton=(SignInButton)findViewById(R.id.SignIn);
        GoogleSignInOptions signInOptions= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleApiClient= new GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,signInOptions).build();
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });
        linear2.setVisibility(View.GONE);
    }
    private void SignIn()
    {
        Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
        startActivityForResult(intent,REQ_CODE);

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE)
        {
            GoogleSignInResult googleSignInResult= Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleResult(googleSignInResult);
        }
    }
  void   handleResult(GoogleSignInResult result)
    {
        if (result.isSuccess())
        {
            GoogleSignInAccount account= result.getSignInAccount();
            String Name= account.getDisplayName();
            String Email= account.getEmail();
            String img_url = account.getPhotoUrl().toString();
            txtEmail.setText(Email);
            txtName.setText(Name);
            Glide.with(this).load(img_url).into(imgView);
            updateUI(true);
        }
    }
    void updateUI(boolean isLogin)
    {
        linear2.setVisibility(View.VISIBLE);
        signInButton.setVisibility(View.GONE);

    }
}
