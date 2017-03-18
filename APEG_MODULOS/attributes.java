// ===========================================================================
// This file has been generated by
// Rats! Parser Generator, version 2.4.0,
// (C) 2004-2014 Robert Grimm,
// on Quarta-feira, 15 de Março de 2017 at 19:52:15.
// Edit at your own risk.
// ===========================================================================

import java.io.Reader;
import java.io.IOException;

import xtc.util.Pair;

import xtc.parser.ParserBase;
import xtc.parser.Column;
import xtc.parser.Result;
import xtc.parser.SemanticValue;
import xtc.parser.ParseError;

/**
 * Packrat parser for grammar <code>attributes</code>.
 *
 * <p />This class has been generated by the <i>Rats!</i> parser
 * generator, version 2.4.0, (C) 2004-2014 Robert Grimm.
 */
public final class attributes extends ParserBase {

  // =========================================================================

  /** Memoization table column. */
  static final class attributesColumn extends Column {
    Result fdecls;
    Result fdecls$$Star1;
    Result fvarDecl;
    Result fID;
    Result fID$$Star1;
    Result fws;
  }

  // =========================================================================

  /**
   * Create a new packrat parser.
   *
   * @param reader The reader.
   * @param file The file name.
   */
  public attributes(final Reader reader, final String file) {
    super(reader, file);
  }

  /**
   * Create a new packrat parser.
   *
   * @param reader The file reader.
   * @param file The file name.
   * @param size The file size.
   */
  public attributes(final Reader reader, final String file, final int size) {
    super(reader, file, size);
  }

  // =========================================================================

  protected Column newColumn() {
    return new attributesColumn();
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.optDecls.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result poptDecls(final int yyStart) throws IOException {
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pdecls(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyValue = null;

      return yyResult.createValue(yyValue, yyError);
    }

    // Done.
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.optReturn.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result poptReturn(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('r' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('e' == yyC) {
        yyIndex = yyIndex + 1;

        yyC = character(yyIndex);
        if ('t' == yyC) {
          yyIndex = yyIndex + 1;

          yyC = character(yyIndex);
          if ('u' == yyC) {
            yyIndex = yyIndex + 1;

            yyC = character(yyIndex);
            if ('r' == yyC) {
              yyIndex = yyIndex + 1;

              yyC = character(yyIndex);
              if ('n' == yyC) {
                yyIndex = yyIndex + 1;

                yyC = character(yyIndex);
                if ('s' == yyC) {
                  yyIndex = yyIndex + 1;

                  yyResult = pws(yyIndex);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyResult = pdecls(yyResult.index);
                    yyError  = yyResult.select(yyError);
                    if (yyResult.hasValue()) {

                      yyValue = null;

                      return yyResult.createValue(yyValue, yyError);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    // Done.
    yyError = yyError.select("opt return expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.optLocals.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result poptLocals(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('l' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('o' == yyC) {
        yyIndex = yyIndex + 1;

        yyC = character(yyIndex);
        if ('c' == yyC) {
          yyIndex = yyIndex + 1;

          yyC = character(yyIndex);
          if ('a' == yyC) {
            yyIndex = yyIndex + 1;

            yyC = character(yyIndex);
            if ('l' == yyC) {
              yyIndex = yyIndex + 1;

              yyC = character(yyIndex);
              if ('s' == yyC) {
                yyIndex = yyIndex + 1;

                yyResult = pws(yyIndex);
                yyError  = yyResult.select(yyError);
                if (yyResult.hasValue()) {

                  yyResult = pdecls(yyResult.index);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyValue = null;

                    return yyResult.createValue(yyValue, yyError);
                  }
                }
              }
            }
          }
        }
      }
    }

    // Done.
    yyError = yyError.select("opt locals expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.decls.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pdecls(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fdecls) yyColumn.fdecls = pdecls$1(yyStart);
    return yyColumn.fdecls;
  }

  /** Actually parse attributes.decls. */
  private Result pdecls$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyOption1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('[' == yyC) {
      yyIndex = yyStart + 1;

      yyOption1  = yyIndex;

      yyResult = pws(yyOption1);
      yyError  = yyResult.select(yyError, yyOption1);
      if (yyResult.hasValue()) {

        yyOption1  = yyResult.index;
      }

      yyResult = pvarDecl(yyOption1);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyOption1  = yyResult.index;

        yyResult = pws(yyOption1);
        yyError  = yyResult.select(yyError, yyOption1);
        if (yyResult.hasValue()) {

          yyOption1  = yyResult.index;
        }

        yyResult = pdecls$$Star1(yyOption1);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyOption1  = yyResult.index;

          yyResult = pws(yyOption1);
          yyError  = yyResult.select(yyError, yyOption1);
          if (yyResult.hasValue()) {

            yyOption1  = yyResult.index;
          }

          yyC = character(yyOption1);
          if (']' == yyC) {
            yyIndex = yyOption1 + 1;

            yyValue = null;

            return new SemanticValue(yyValue, yyIndex, yyError);
          }
        }
      }
    }

    // Done.
    yyError = yyError.select("decls expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse synthetic nonterminal attributes.decls$$Star1.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result pdecls$$Star1(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fdecls$$Star1) 
      yyColumn.fdecls$$Star1 = pdecls$$Star1$1(yyStart);
    return yyColumn.fdecls$$Star1;
  }

  /** Actually parse attributes.decls$$Star1. */
  private Result pdecls$$Star1$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (',' == yyC) {
      yyIndex = yyStart + 1;

      yyResult = pvarDecl(yyIndex);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyResult = pdecls$$Star1(yyResult.index);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyValue = null;

          return yyResult.createValue(yyValue, yyError);
        }
      }
    }

    // Alternative 2.

    yyValue = null;

    return new SemanticValue(yyValue, yyStart, yyError);
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.varDecl.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pvarDecl(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fvarDecl) yyColumn.fvarDecl = pvarDecl$1(yyStart);
    return yyColumn.fvarDecl;
  }

  /** Actually parse attributes.varDecl. */
  private Result pvarDecl$1(final int yyStart) throws IOException {
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = ptype(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyResult = pws(yyResult.index);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyResult = pID(yyResult.index);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyValue = null;

          return yyResult.createValue(yyValue, yyError);
        }
      }
    }

    // Done.
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal attributes.type.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result ptype(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case 'i':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('n' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('t' == yyC) {

                  yyResult = pws(yyIndex);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyValue = null;

                    return yyResult.createValue(yyValue, yyError);
                  }
                }
              }
            }
          }
        }
        break;

      case 'f':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('l' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('o' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('a' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('t' == yyC) {

                          yyResult = pws(yyIndex);
                          yyError  = yyResult.select(yyError);
                          if (yyResult.hasValue()) {

                            yyValue = null;

                            return yyResult.createValue(yyValue, yyError);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'b':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('o' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('o' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('l' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('e' == yyC) {

                          yyC = character(yyIndex);
                          if (-1 != yyC) {
                            yyIndex = yyIndex + 1;
                            if ('a' == yyC) {

                              yyC = character(yyIndex);
                              if (-1 != yyC) {
                                yyIndex = yyIndex + 1;
                                if ('n' == yyC) {

                                  yyResult = pws(yyIndex);
                                  yyError  = yyResult.select(yyError);
                                  if (yyResult.hasValue()) {

                                    yyValue = null;

                                    return yyResult.createValue(yyValue, yyError);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 's':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('t' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('r' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('i' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('n' == yyC) {

                          yyC = character(yyIndex);
                          if (-1 != yyC) {
                            yyIndex = yyIndex + 1;
                            if ('g' == yyC) {

                              yyResult = pws(yyIndex);
                              yyError  = yyResult.select(yyError);
                              if (yyResult.hasValue()) {

                                yyValue = null;

                                return yyResult.createValue(yyValue, yyError);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'g':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('r' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('a' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('m' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('m' == yyC) {

                          yyC = character(yyIndex);
                          if (-1 != yyC) {
                            yyIndex = yyIndex + 1;
                            if ('a' == yyC) {

                              yyC = character(yyIndex);
                              if (-1 != yyC) {
                                yyIndex = yyIndex + 1;
                                if ('r' == yyC) {

                                  yyResult = pws(yyIndex);
                                  yyError  = yyResult.select(yyError);
                                  if (yyResult.hasValue()) {

                                    yyValue = null;

                                    return yyResult.createValue(yyValue, yyError);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'r':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('u' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('l' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('e' == yyC) {

                      yyResult = pws(yyIndex);
                      yyError  = yyResult.select(yyError);
                      if (yyResult.hasValue()) {

                        yyValue = null;

                        return yyResult.createValue(yyValue, yyError);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      default:
        /* No match. */
      }
    }

    // Alternative 2.

    yyResult = pID(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyValue = null;

      return yyResult.createValue(yyValue, yyError);
    }

    // Done.
    yyError = yyError.select("type expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal lexical.ID.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result pID(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fID) yyColumn.fID = pID$1(yyStart);
    return yyColumn.fID;
  }

  /** Actually parse lexical.ID. */
  private Result pID$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;
      if (('a' <= yyC) && (yyC <= 'z')) {

        yyResult = pID$$Star1(yyIndex);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyValue = null;

          return yyResult.createValue(yyValue, yyError);
        }
      }
    }

    // Done.
    yyError = yyError.select("ID expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse synthetic nonterminal attributes.ID$$Star1.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result pID$$Star1(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fID$$Star1) 
      yyColumn.fID$$Star1 = pID$$Star1$1(yyStart);
    return yyColumn.fID$$Star1;
  }

  /** Actually parse attributes.ID$$Star1. */
  private Result pID$$Star1$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;
      if (('a' <= yyC) && (yyC <= 'z')) {

        yyResult = pID$$Star1(yyIndex);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyValue = null;

          return yyResult.createValue(yyValue, yyError);
        }
      }
    }

    // Alternative 2.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        {
          yyResult = pID$$Star1(yyIndex);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }
        }
        break;

      case '_':
        {
          yyResult = pID$$Star1(yyIndex);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }
        }
        break;

      default:
        /* No match. */
      }
    }

    // Alternative 3.

    yyValue = null;

    return new SemanticValue(yyValue, yyStart, yyError);
  }

  // =========================================================================

  /**
   * Parse nonterminal spacing.ws.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result pws(final int yyStart) throws IOException {
    attributesColumn yyColumn = (attributesColumn)column(yyStart);
    if (null == yyColumn.fws) yyColumn.fws = pws$1(yyStart);
    return yyColumn.fws;
  }

  /** Actually parse spacing.ws. */
  private Result pws$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    int        yyOption1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case ' ':
        {
          yyValue = null;

          return new SemanticValue(yyValue, yyIndex, yyError);
        }

      case '\t':
        {
          yyValue = null;

          return new SemanticValue(yyValue, yyIndex, yyError);
        }

      default:
        /* No match. */
      }
    }

    // Alternative 2.

    yyOption1  = yyStart;

    yyC = character(yyOption1);
    if ('\r' == yyC) {
      yyIndex = yyOption1 + 1;

      yyOption1  = yyIndex;
    }

    yyC = character(yyOption1);
    if ('\n' == yyC) {
      yyIndex = yyOption1 + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Alternative 3.

    yyC = character(yyStart);
    if ('\r' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("ws expected", yyStart);
    return yyError;
  }

}