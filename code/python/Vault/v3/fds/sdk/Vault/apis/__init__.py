
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.components_api import ComponentsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.Vault.api.components_api import ComponentsApi
from fds.sdk.Vault.api.configurations_api import ConfigurationsApi
from fds.sdk.Vault.api.dates_api import DatesApi
from fds.sdk.Vault.api.documents_api import DocumentsApi
from fds.sdk.Vault.api.frequencies_api import FrequenciesApi
from fds.sdk.Vault.api.vault_calculations_api import VaultCalculationsApi
