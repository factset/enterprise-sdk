
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.ai_text_summarization_api import AITextSummarizationApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.NaturalLanguageProcessing.api.ai_text_summarization_api import AITextSummarizationApi
from fds.sdk.NaturalLanguageProcessing.api.ai_themes_api import AIThemesApi
