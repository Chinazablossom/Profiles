package com.example.profiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import com.example.profiles.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {
    lateinit var webView: WebView
    lateinit var binding: ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webView = binding.webViewId
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        val githubUrl = "https://github.com/Chinazablossom"
        openGitHubProfile(githubUrl)


    }

    private fun openGitHubProfile(url: String) {
        webView.visibility = View.VISIBLE
        webView.loadUrl(url)
    }


}