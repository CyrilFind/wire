// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import com.squareup.wire.protos.custom_options.FooBar
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class EnumValueOptions(
  /**
   * Is this enum value deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum value, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating enum values.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val deprecated: Boolean? = null,
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 70000,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val enum_value_option: Int? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 70001,
    adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}More#ADAPTER"
  )
  val complex_enum_value_option: FooBar.More? = null,
  /**
   * Extension source: foreign.proto
   */
  @field:WireField(
    tag = 70002,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val foreign_enum_value_option: Boolean? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<EnumValueOptions, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EnumValueOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (deprecated != other.deprecated) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    if (enum_value_option != other.enum_value_option) return false
    if (complex_enum_value_option != other.complex_enum_value_option) return false
    if (foreign_enum_value_option != other.foreign_enum_value_option) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      result = result * 37 + enum_value_option.hashCode()
      result = result * 37 + complex_enum_value_option.hashCode()
      result = result * 37 + foreign_enum_value_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    if (enum_value_option != null) result += """enum_value_option=$enum_value_option"""
    if (complex_enum_value_option != null) result +=
        """complex_enum_value_option=$complex_enum_value_option"""
    if (foreign_enum_value_option != null) result +=
        """foreign_enum_value_option=$foreign_enum_value_option"""
    return result.joinToString(prefix = "EnumValueOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    deprecated: Boolean? = this.deprecated,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    enum_value_option: Int? = this.enum_value_option,
    complex_enum_value_option: FooBar.More? = this.complex_enum_value_option,
    foreign_enum_value_option: Boolean? = this.foreign_enum_value_option,
    unknownFields: ByteString = this.unknownFields
  ): EnumValueOptions = EnumValueOptions(deprecated, uninterpreted_option, enum_value_option,
      complex_enum_value_option, foreign_enum_value_option, unknownFields)

  companion object {
    const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<EnumValueOptions> = object : ProtoAdapter<EnumValueOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumValueOptions::class, 
      "type.googleapis.com/google.protobuf.EnumValueOptions"
    ) {
      override fun encodedSize(value: EnumValueOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(1, value.deprecated)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        size += ProtoAdapter.INT32.encodedSizeWithTag(70000, value.enum_value_option)
        size += FooBar.More.ADAPTER.encodedSizeWithTag(70001, value.complex_enum_value_option)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(70002, value.foreign_enum_value_option)
        return size
      }

      override fun encode(writer: ProtoWriter, value: EnumValueOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.deprecated)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        ProtoAdapter.INT32.encodeWithTag(writer, 70000, value.enum_value_option)
        FooBar.More.ADAPTER.encodeWithTag(writer, 70001, value.complex_enum_value_option)
        ProtoAdapter.BOOL.encodeWithTag(writer, 70002, value.foreign_enum_value_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): EnumValueOptions {
        var deprecated: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        var enum_value_option: Int? = null
        var complex_enum_value_option: FooBar.More? = null
        var foreign_enum_value_option: Boolean? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            70000 -> enum_value_option = ProtoAdapter.INT32.decode(reader)
            70001 -> complex_enum_value_option = FooBar.More.ADAPTER.decode(reader)
            70002 -> foreign_enum_value_option = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumValueOptions(
          deprecated = deprecated,
          uninterpreted_option = uninterpreted_option,
          enum_value_option = enum_value_option,
          complex_enum_value_option = complex_enum_value_option,
          foreign_enum_value_option = foreign_enum_value_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: EnumValueOptions): EnumValueOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        complex_enum_value_option =
            value.complex_enum_value_option?.let(FooBar.More.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
