class VulnerableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // ...other setup code...
        
        // Get WebView from layout
        val myWebView: WebView = findViewById(R.id.webview)
        // Enable JavaScript (only configuration required)
        myWebView.settings.javaScriptEnabled = true
        // Load parent page
        myWebView.loadUrl("https://PARENT_ORIGIN/parent.html")
    }
}
