# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Usuario.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='Usuario.proto',
  package='model',
  syntax='proto3',
  serialized_options=_b('\n\024sd.ufc.reserva.modelB\rObjectUsuario'),
  serialized_pb=_b('\n\rUsuario.proto\x12\x05model\"&\n\x07Usuario\x12\x0c\n\x04nome\x18\x01 \x01(\t\x12\r\n\x05senha\x18\x02 \x01(\tB%\n\x14sd.ufc.reserva.modelB\rObjectUsuariob\x06proto3')
)




_USUARIO = _descriptor.Descriptor(
  name='Usuario',
  full_name='model.Usuario',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='nome', full_name='model.Usuario.nome', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='senha', full_name='model.Usuario.senha', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=24,
  serialized_end=62,
)

DESCRIPTOR.message_types_by_name['Usuario'] = _USUARIO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Usuario = _reflection.GeneratedProtocolMessageType('Usuario', (_message.Message,), {
  'DESCRIPTOR' : _USUARIO,
  '__module__' : 'Usuario_pb2'
  # @@protoc_insertion_point(class_scope:model.Usuario)
  })
_sym_db.RegisterMessage(Usuario)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)