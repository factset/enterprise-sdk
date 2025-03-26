
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.federations_api import FederationsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.ProcuretoPayAPISCIM.api.federations_api import FederationsApi
from fds.sdk.ProcuretoPayAPISCIM.api.file_manager_audit_api import FileManagerAuditApi
from fds.sdk.ProcuretoPayAPISCIM.api.firm_descriptions_api import FirmDescriptionsApi
from fds.sdk.ProcuretoPayAPISCIM.api.groups_api import GroupsApi
from fds.sdk.ProcuretoPayAPISCIM.api.locations_api import LocationsApi
from fds.sdk.ProcuretoPayAPISCIM.api.products_api import ProductsApi
from fds.sdk.ProcuretoPayAPISCIM.api.schemas_api import SchemasApi
from fds.sdk.ProcuretoPayAPISCIM.api.service_provider_configuration_api import ServiceProviderConfigurationApi
from fds.sdk.ProcuretoPayAPISCIM.api.user_classes_api import UserClassesApi
from fds.sdk.ProcuretoPayAPISCIM.api.user_positions_api import UserPositionsApi
from fds.sdk.ProcuretoPayAPISCIM.api.users_api import UsersApi
