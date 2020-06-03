// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: keyword_kotlin.proto
package squareup.keywords

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.missingRequiredFields
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class KeywordKotlin(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "object"
  )
  @JvmField
  val object_: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED,
    declaredName = "when"
  )
  @JvmField
  val when_: Int,
  @field:WireField(
    tag = 3,
    keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "fun"
  )
  @JvmField
  val fun_: Map<String, String> = emptyMap(),
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.REPEATED,
    declaredName = "return"
  )
  @JvmField
  val return_: List<Boolean> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<KeywordKotlin, KeywordKotlin.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.object_ = object_
    builder.when_ = when_
    builder.fun_ = fun_
    builder.return_ = return_
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is KeywordKotlin) return false
    if (unknownFields != other.unknownFields) return false
    if (object_ != other.object_) return false
    if (when_ != other.when_) return false
    if (fun_ != other.fun_) return false
    if (return_ != other.return_) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + object_.hashCode()
      result = result * 37 + when_.hashCode()
      result = result * 37 + fun_.hashCode()
      result = result * 37 + return_.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (object_ != null) result += """object_=${sanitize(object_)}"""
    result += """when_=$when_"""
    if (fun_.isNotEmpty()) result += """fun_=$fun_"""
    if (return_.isNotEmpty()) result += """return_=$return_"""
    return result.joinToString(prefix = "KeywordKotlin{", separator = ", ", postfix = "}")
  }

  fun copy(
    object_: String? = this.object_,
    when_: Int = this.when_,
    fun_: Map<String, String> = this.fun_,
    return_: List<Boolean> = this.return_,
    unknownFields: ByteString = this.unknownFields
  ): KeywordKotlin = KeywordKotlin(object_, when_, fun_, return_, unknownFields)

  class Builder : Message.Builder<KeywordKotlin, Builder>() {
    @JvmField
    var object_: String? = null

    @JvmField
    var when_: Int? = null

    @JvmField
    var fun_: Map<String, String> = emptyMap()

    @JvmField
    var return_: List<Boolean> = emptyList()

    fun object_(object_: String?): Builder {
      this.object_ = object_
      return this
    }

    fun when_(when_: Int): Builder {
      this.when_ = when_
      return this
    }

    fun fun_(fun_: Map<String, String>): Builder {
      this.fun_ = fun_
      return this
    }

    fun return_(return_: List<Boolean>): Builder {
      checkElementsNotNull(return_)
      this.return_ = return_
      return this
    }

    override fun build(): KeywordKotlin = KeywordKotlin(
      object_ = object_,
      when_ = when_ ?: throw missingRequiredFields(when_, "when_"),
      fun_ = fun_,
      return_ = return_,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<KeywordKotlin> = object : ProtoAdapter<KeywordKotlin>(
      FieldEncoding.LENGTH_DELIMITED, 
      KeywordKotlin::class, 
      "type.googleapis.com/squareup.keywords.KeywordKotlin"
    ) {
      private val funAdapter: ProtoAdapter<Map<String, String>> =
          ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING)

      override fun encodedSize(value: KeywordKotlin): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.object_)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.when_)
        size += funAdapter.encodedSizeWithTag(3, value.fun_)
        size += ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(4, value.return_)
        return size
      }

      override fun encode(writer: ProtoWriter, value: KeywordKotlin) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.object_)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.when_)
        funAdapter.encodeWithTag(writer, 3, value.fun_)
        ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): KeywordKotlin {
        var object_: String? = null
        var when_: Int? = null
        val fun_ = mutableMapOf<String, String>()
        val return_ = mutableListOf<Boolean>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> object_ = ProtoAdapter.STRING.decode(reader)
            2 -> when_ = ProtoAdapter.INT32.decode(reader)
            3 -> fun_.putAll(funAdapter.decode(reader))
            4 -> return_.add(ProtoAdapter.BOOL.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return KeywordKotlin(
          object_ = object_,
          when_ = when_ ?: throw missingRequiredFields(when_, "when"),
          fun_ = fun_,
          return_ = return_,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: KeywordKotlin): KeywordKotlin = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
