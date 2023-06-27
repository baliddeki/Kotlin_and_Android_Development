package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity: AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var clickButton: Button
    private lateinit var editText: EditText
    private lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // textView = findViewById(R.id.textView)
        clickButton = findViewById(R.id.clickButton)
        imageView = findViewById(R.id.imageView)
        //editText = findViewById(R.id.editName)

       /* textView.setOnClickListener{
            textView.setTextColor(Color.GREEN)
            textView.setBackgroundColor(Color.RED)
            textView.text = editText.text.toString()
        }

        */

        clickButton.setOnClickListener{
            var i: Int = 0
            imageView.setImageResource(R.drawable.image1)
            clickButton.setOnClickListener{
                imageView.setImageResource(R.drawable.image2)
                clickButton.setOnClickListener{
                    imageView.setImageResource(R.drawable.image3)
                    clickButton.setOnClickListener{
                        imageView.setImageResource(R.drawable.image4)
                        clickButton.setOnClickListener{
                            imageView.setImageResource(R.drawable.image5)
                            clickButton.setOnClickListener{
                                imageView.setImageResource(R.drawable.image6)
                                clickButton.setOnClickListener{
                                    imageView.setImageResource(R.drawable.image7)
                                    clickButton.setOnClickListener{
                                        imageView.setImageResource(R.drawable.image8)
                                        clickButton.setOnClickListener{
                                            imageView.setImageResource(R.drawable.image9)
                                            clickButton.setOnClickListener{
                                                imageView.setImageResource(R.drawable.image10)
                                                clickButton.setOnClickListener{
                                                    imageView.setImageResource(R.drawable.image11)
                                                    clickButton.setOnClickListener{
                                                        imageView.setImageResource(R.drawable.image12)
                                                        clickButton.setOnClickListener{
                                                            imageView.setImageResource(R.drawable.image13)
                                                            clickButton.setOnClickListener{
                                                                imageView.setImageResource(R.drawable.image14)
                                                                clickButton.setOnClickListener{
                                                                    imageView.setImageResource(R.drawable.image15)
                                                                    clickButton.setOnClickListener{
                                                                        imageView.setImageResource(R.drawable.image17)
                                                                        clickButton.setOnClickListener{
                                                                            imageView.setImageResource(R.drawable.image18)
                                                                            clickButton.setOnClickListener{
                                                                                imageView.setImageResource(R.drawable.image19)
                                                                                clickButton.setOnClickListener{
                                                                                    imageView.setImageResource(R.drawable.image20)
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
