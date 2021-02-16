package br.maua.listadecontatos.bases

import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import android.R

class BaseActivity: AppCompatActivity() {
    protected fun setupToolBar(toolBar: Toolbar, title: String, navgationBack: Boolean) {
        toolBar.title = title
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(navgationBack)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when ( item.itemId ) {
            R.id.home -> {
                this.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}