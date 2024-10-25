package srimulyaniadha.com.example.utspemogramanmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import srimulyaniadha.com.example.utspemogramanmobile.databinding.ActivityMainBinding
import android.view.MenuItem
import android.view.Menu

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHitung.setOnClickListener {
            val sisi = binding.etSisi.text.toString().toDoubleOrNull()

            if (sisi != null) {
                // Menghitung volume kubus
                val volume = sisi * sisi * sisi
                // Menghitung luas permukaan kubus
                val luasPermukaan = 6 * (sisi * sisi)

                // Menampilkan hasil
                binding.tvHasilVolume.text = "Volume: $volume"
                binding.tvHasilLuas.text = "Luas Permukaan: $luasPermukaan"
            } else {
                binding.tvHasilVolume.text = "Masukkan panjang sisi yang valid!"
                binding.tvHasilLuas.text = ""

            }

        }
    }
    // Menu: menambahkan opsi menu di activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Menu: aksi yang dilakukan ketika item di menu dipilih
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                // Aksi ketika Settings dipilih
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

