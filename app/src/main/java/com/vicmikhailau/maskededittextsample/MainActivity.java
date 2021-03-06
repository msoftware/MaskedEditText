package com.vicmikhailau.maskededittextsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.vicmikhailau.maskededittext.MaskedEditText;
import com.vicmikhailau.maskededittext.MaskedWatcher;

public class MainActivity extends AppCompatActivity {

    /**
     * Use specific values for create your own mask (see example below or in xml):
     * ANYTHING_KEY = '*'
     * DIGIT_KEY = '#'
     * UPPERCASE_KEY = 'U';
     * LOWERCASE_KEY = 'L';
     * ALPHA_NUMERIC_KEY = 'A';
     * LITERAL_KEY = '\'';
     * CHARACTER_KEY = '?';
     * HEX_KEY = 'H';
     */

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    private MaskedEditText mEdtMaskedCustom;
    private MaskedEditText mEdtMaskedCustomSample;

    private EditText mEdtMasked;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setMask("##/##/####");
    }

    // ===========================================================
    // Listeners, methods for/from Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    private void findViews() {
        mEdtMaskedCustom = (MaskedEditText) findViewById(R.id.edt_masked_custom);
        mEdtMaskedCustomSample = (MaskedEditText) findViewById(R.id.edt_masked_custom_sample);

        mEdtMasked = (EditText) findViewById(R.id.edt_masked);
    }

    /**
     * You cas use MaskedEditText declared in xml with attribute named mask
     * or
     * set mask in code for default EdiText
     *
     * @param mask your mask
     */
    private void setMask(String mask) {
        mEdtMasked.addTextChangedListener(new MaskedWatcher(mask));
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
