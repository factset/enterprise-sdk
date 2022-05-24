
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.contacts___custom_fields_api import ContactsCustomFieldsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.IRNConfiguration.api.contacts___custom_fields_api import ContactsCustomFieldsApi
from fds.sdk.IRNConfiguration.api.contacts___phone_number_types_api import ContactsPhoneNumberTypesApi
from fds.sdk.IRNConfiguration.api.contacts___relationship_category_api import ContactsRelationshipCategoryApi
from fds.sdk.IRNConfiguration.api.contacts___relationships_api import ContactsRelationshipsApi
from fds.sdk.IRNConfiguration.api.contacts___roles_api import ContactsRolesApi
from fds.sdk.IRNConfiguration.api.contacts___types_api import ContactsTypesApi
from fds.sdk.IRNConfiguration.api.custom_symbols___custom_fields_api import CustomSymbolsCustomFieldsApi
from fds.sdk.IRNConfiguration.api.custom_symbols___relationships_api import CustomSymbolsRelationshipsApi
from fds.sdk.IRNConfiguration.api.custom_symbols___types_api import CustomSymbolsTypesApi
from fds.sdk.IRNConfiguration.api.notes___configuration_api import NotesConfigurationApi
