import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uvg.lab9anggelie.Character
import com.uvg.lab9anggelie.CharacterDb
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class CharacterListViewModel : ViewModel() {
    private val _state = MutableStateFlow<CharacterListState>(CharacterListState.Loading)
    val state: StateFlow<CharacterListState> = _state

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        viewModelScope.launch {
            _state.value = CharacterListState.Loading
            delay(4000) // Simular carga de 4 segundos
            try {
                val characters = CharacterDb.getCharacters()
                _state.value = CharacterListState.Success(characters)
            } catch (e: Exception) {
                _state.value = CharacterListState.Error
            }
        }
    }
}

sealed class CharacterListState {
    object Loading : CharacterListState()
    data class Success(val characters: List<Character>) : CharacterListState()
    object Error : CharacterListState()
}